using System;

namespace MSUBears
{
    class Program
    {
        static void Main(string[] args)
        {
            double numberLimit = 100;
            
            for(int i = 1; i <= 100; i++){

                if (i % 3 == 0 && i % 5 == 0){ 
                    Console.WriteLine("MSUBears");
                }
                else if (i % 5 == 0){
                    Console.WriteLine("Bears");
                }
                else if (i % 3 == 0){
                    Console.WriteLine("MSU");
                }
                else{
                    Console.WriteLine(i);
                }
            }
        }
    }
}
