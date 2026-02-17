using Lab3_Task4_Pro.Models;
using Microsoft.AspNetCore.Mvc;

namespace Lab3_Task4_Pro.Controllers
{
    public class CourseController : Controller
    {
        public IActionResult Index()
        {
            List<CourseModel> courseModels = new List<CourseModel>();
            // Semester 1
            courseModels.Add(new CourseModel(1, "Introduction to C#", 3, 1));
            courseModels.Add(new CourseModel(2, "Database Management Systems", 3, 1));
            courseModels.Add(new CourseModel(3, "Web Development with ASP.NET", 3, 1));
            courseModels.Add(new CourseModel(4, "Data Structures & Algorithms", 4, 1));
            courseModels.Add(new CourseModel(5, "Cloud Computing Essentials", 3, 1));
            courseModels.Add(new CourseModel(6, "Machine Learning Basics", 4, 1));

            // Semester 2
            courseModels.Add(new CourseModel(7, "Cybersecurity Fundamentals", 3, 2));
            courseModels.Add(new CourseModel(8, "Mobile App Development", 3, 2));
            courseModels.Add(new CourseModel(9, "UI/UX Design Principles", 2, 2));
            courseModels.Add(new CourseModel(10, "Software Testing & QA", 3, 2));
            courseModels.Add(new CourseModel(11, "Advanced C# Programming", 3, 2));
            courseModels.Add(new CourseModel(12, "Project Management", 2, 2));

            return View(courseModels);
        }

        public IActionResult List(int? id)
        {
            Random random = new Random();
            List<CourseModel> courseModels = new List<CourseModel>();
            // Semester 1
            courseModels.Add(new CourseModel(1, "Introduction to C#", 3, 1));
            courseModels.Add(new CourseModel(2, "Database Management Systems", 3, 1));
            courseModels.Add(new CourseModel(3, "Web Development with ASP.NET", 3, 1));
            courseModels.Add(new CourseModel(4, "Data Structures & Algorithms", 4, 1));
            courseModels.Add(new CourseModel(5, "Cloud Computing Essentials", 3, 1));
            courseModels.Add(new CourseModel(6, "Machine Learning Basics", 4, 1));

            // Semester 2
            courseModels.Add(new CourseModel(7, "Cybersecurity Fundamentals", 3, 2));
            courseModels.Add(new CourseModel(8, "Mobile App Development", 3, 2));
            courseModels.Add(new CourseModel(9, "UI/UX Design Principles", 2, 2));
            courseModels.Add(new CourseModel(10, "Software Testing & QA", 3, 2));
            courseModels.Add(new CourseModel(11, "Advanced C# Programming", 3, 2));
            courseModels.Add(new CourseModel(12, "Project Management", 2, 2));

            List<CourseModel> filteredCourses=new List<CourseModel>();

            if (id.HasValue)
            {
                foreach(var course in courseModels)
                {
                    if(course.Semester == id.Value)
                    {
                        filteredCourses.Add(course);
                    }
                }
            }

            return View(filteredCourses);
        }

    }
}
