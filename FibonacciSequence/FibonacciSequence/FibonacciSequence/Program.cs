using System;

namespace FibonacciSequence
{
    class Program
    {
        static void Main(string[] args)
        {
            int fibInput = 0;
            int fibOne = 1;
            int fibTwo = 0;
            int currentFib = 0;

            try
            {
                Console.Write("Enter your your (nth) number: ");

                fibInput = Int32.Parse(Console.ReadLine());
            }
            catch
            {
                Console.Write("User input not a number.");
            }

            for (int i = 0; i < fibInput; i++)
            {
                // if i = 0 || 1 then print i
                if (i == 0 || i == 1)
                {
                    Console.WriteLine(i);
                }

                else 
                {
                    currentFib = fibOne + fibTwo;
                    Console.WriteLine(currentFib);
                    fibTwo = fibOne;
                    fibOne = currentFib;
                }
                
            }

        }
    }
}
