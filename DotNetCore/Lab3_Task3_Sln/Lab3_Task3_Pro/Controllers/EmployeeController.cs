using Lab3_Task3_Pro.Models;
using Microsoft.AspNetCore.Mvc;

namespace Lab3_Task3_Pro.Controllers
{
    public class EmployeeController : Controller
    {
        public IActionResult Index()
        {
            Random random = new Random();
            String[] names ={
                "Alice", "Bob", "Charlie", "Diana", "Ethan",
                "Fiona", "George", "Hannah", "Ian", "Julia"
            };
            String[] designations ={
                "Software Engineer", "Manager", "Marketing Lead", "Data Scientist", "Project Manager",
                "UX Designer", "DevOps Engineer", "Product Owner", "QA Analyst", "System Administrator"
            };
            List<EmployeeModel> employeeModels = new List<EmployeeModel>();
            for(int i=1; i<=10; i++)
            {
                employeeModels.Add(
                    new EmployeeModel(
                        names[random.Next(0,10)],
                        random.Next(20000,80000),
                        designations[random.Next(0,10)]
                    )
                );
            }
            return View(employeeModels);
        }
    }
}
