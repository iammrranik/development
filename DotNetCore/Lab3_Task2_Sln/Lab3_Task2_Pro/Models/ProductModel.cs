namespace Lab3_Task2_Pro.Models
{
    public class ProductModel
    {
        public int Id { get; set; }
        public String Name { get; set; }
        public float Price { get; set; }
        public String Category { get; set; }

        public ProductModel(int id, string name, float price, string category)
        {
            Id = id;
            Name = name;
            Price = price;
            Category = category;
        }

    }
}
