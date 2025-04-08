import os
import re

# Folder Paths
input_folder = "P:/AutoStates"  # FIXED: Use actual folder where .java files are
output_folder = "P:/AutoStates/Generated"
package_name = "Assesments10"  # change if needed

# Ensure output folder exists
os.makedirs(output_folder, exist_ok=True)

# Get all parent files ending with "Parent.java"
parent_files = [f for f in os.listdir(input_folder) if f.endswith("Parent.java")]

# Extract methods from parent file
def extract_methods(file_path):
    with open(file_path, "r") as file:
        content = file.read()
        return re.findall(r"\bvoid\s+(\w+)\s*\(", content)

# Loop through each parent file
for parent_file in parent_files:
    parent_class = parent_file.replace(".java", "")
    child_class = parent_class + "Details"
    cast_class = parent_class + "Cast"
    runner_class = parent_class + "Runner"
    extra_method = "extraMethod"

    # Extract method names from parent
    methods = extract_methods(os.path.join(input_folder, parent_file))

    # ----------------- CHILD CLASS -----------------
    with open(os.path.join(output_folder, f"{child_class}.java"), "w") as f:
        f.write(f"package {package_name};\n\n")
        f.write(f"public class {child_class} extends {parent_class} {{\n")
        for method in methods:
            f.write(f"    @Override\n")
            f.write(f"    public void {method}() {{\n")
            f.write(f"        System.out.println(\"Overridden: {method} in {child_class}\");\n")
            f.write("    }\n\n")
        f.write(f"    public void {extra_method}() {{\n")
        f.write(f"        System.out.println(\"Running extra method in {child_class}\");\n")
        f.write("    }\n")
        f.write("}\n")

    # ----------------- CAST CLASS -----------------
    with open(os.path.join(output_folder, f"{cast_class}.java"), "w") as f:
        f.write(f"package {package_name};\n\n")
        f.write(f"public class {cast_class} {{\n")
        f.write(f"    public void cast({parent_class} obj) {{\n")
        f.write(f"        System.out.println(\"Casting {parent_class}\");\n")
        for method in methods:
            f.write(f"        obj.{method}();\n")
        f.write(f"        if(obj instanceof {child_class}) {{\n")
        f.write(f"            {child_class} ref = ({child_class})obj;\n")
        f.write(f"            ref.{extra_method}();\n")
        f.write("        }\n")
        f.write("    }\n")
        f.write("}\n")

    # ----------------- RUNNER CLASS -----------------
    with open(os.path.join(output_folder, f"{runner_class}.java"), "w") as f:
        f.write(f"package {package_name};\n\n")
        f.write(f"public class {runner_class} {{\n")
        f.write(f"    public static void main(String[] args) {{\n\n")

        # Original object
        f.write(f"        {parent_class} obj1 = new {parent_class}();\n")
        for method in methods:
            f.write(f"        obj1.{method}();\n")
        f.write("        System.out.println(\"----------------------\");\n\n")

        # Polymorphic object
        f.write(f"        {parent_class} obj2 = new {child_class}();\n")
        for method in methods:
            f.write(f"        obj2.{method}();\n")
        f.write("        System.out.println(\"----------------------\");\n\n")

        # Child object
        f.write(f"        {child_class} obj3 = new {child_class}();\n")
        for method in methods:
            f.write(f"        obj3.{method}();\n")
        f.write(f"        obj3.{extra_method}();\n")
        f.write("        System.out.println(\"----------------------\");\n\n")

        # Call cast
        f.write(f"        {cast_class} caster = new {cast_class}();\n")
        f.write(f"        caster.cast(obj2);\n")

        f.write("    }\n")
        f.write("}\n")

print("✅ All Java files (Child, Cast, Runner) generated successfully!")
