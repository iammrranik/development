namespace Lab3_Task3_Pro.Models
{
    public class EmployeeModel
    {
        internal String Name { get; set; }
        internal float Salary { get; set; }
        internal String Designation { get; set; }

        public EmployeeModel(string name, float salary, string designation)
        {
            Name = name;
            Salary = salary;
            Designation = designation;
        }

    }
}
