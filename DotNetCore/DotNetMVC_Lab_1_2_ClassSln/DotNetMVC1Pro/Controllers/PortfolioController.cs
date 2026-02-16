using DotNetMVC1Pro.Models;
using Microsoft.AspNetCore.Mvc;

namespace DotNetMVC1Pro.Controllers
{
    public class PortfolioController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        public IActionResult Education()
        {
            if (true)
            {
                return RedirectToAction("Privacy", "Home");
            }
            return View();
        }

        public IActionResult Education2()
        {
            //ViewBag ViewData ModelBinding -> 

            var a = 90; // compilation time type checking

            dynamic b = 78; // no compilation time type checking, runtime type checking

            ViewBag.Name = "Tanvir";
            ViewBag.Id = "123";

            ViewData["CGPA"] = 3.98f; //dictionary syntax

            EducationItem edu1 = new EducationItem();
            edu1.Title = "SSC";
            edu1.Year = 2017;
            edu1.Result = 4.56f;

            EducationItem edu2 = new EducationItem()
            {
                Title = "HSC",
                Year = 2019,
                Result = 4.78f
            };

            EducationItem[] edus = new EducationItem[] { edu1, edu2 };

            return View(edus);
        }

    }
}
