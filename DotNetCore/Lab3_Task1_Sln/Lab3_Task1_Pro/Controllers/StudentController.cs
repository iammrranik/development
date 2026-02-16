using Lab3_Task1_Pro.Models;
using Microsoft.AspNetCore.Mvc;

namespace Lab3_Task1_Pro.Controllers
{
    public class StudentController : Controller
    {
        public IActionResult Index()
        {
            Random random = new Random();
            List<Student> students = new List<Student>();
            for(int i=1; i<=10; i++)
            {
                students.Add(new Student(
                        i,
                        "Student " + i,
                        random.Next(10, 30),
                        "Department " + random.Next(1,4),
                        random.Next(1, 4) + (float)random.NextDouble()
                    )
                );
            }
            return View(students);
        }

        public IActionResult Profile(int id)
        {
            Student student = new Student(
                id,
                "Student " + id,
                new Random().Next(10, 30),
                "Department " + new Random().Next(1, 4),
                new Random().Next(1, 4) + (float)new Random().NextDouble()
            );
            return View(student);
        }
    }
}
