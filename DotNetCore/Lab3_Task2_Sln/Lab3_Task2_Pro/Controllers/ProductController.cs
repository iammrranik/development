using Lab3_Task2_Pro.Models;
using Microsoft.AspNetCore.Mvc;
using System;

namespace Lab3_Task2_Pro.Controllers
{
    public class ProductController : Controller
    {
        public IActionResult Index()
        {
            Random random = new Random();
            List<ProductModel> products = new List<ProductModel>();
            for (int i = 1; i <= 10; i++)
            {
                products.Add(new ProductModel(
                    i,
                    "Product " + i,
                    i * 10,
                    "Category " + random.Next(1, 4)
                    )
                );
            }
            return View(products);
        }

        public IActionResult Details(int id)
        {
            Random random = new Random();
            ProductModel product = new ProductModel(
                id,
                "Product " + id,
                id * 10,
                "Category " + random.Next(1, 4)
            );
            return View(product);
        }
    }
}
