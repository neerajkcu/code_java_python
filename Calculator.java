class Calc {
 
    // Method with 2 integer parameters
    static int Add(int a, int b)
    {
 
        // Returns addition of 2 integer numbers
        return a + b;
    }
 
    // Method with same name but 3 integer parameters
    static int Add(int a, int b, int c)
    {
 
        // Returns addition of 3 integer numbers
        return a + b + c;
    }
    // Method with same name but 4 integer parameters
    static int Add(int a, int b, int c, int d)
    {
 
        // Returns addition of 4 integer numbers
        return a + b + c + d;
    }
}

class Calculator {
 
    // Java’s driver method
    public static void main(String[] args)
    {
    
        System.out.println(Calc.Add(2, 4));
        // Overloading (polymorphism)
        System.out.println(Calc.Add(2, 4, 6));
        System.out.println(Calc.Add(2, 4, 6, 8));
    }
}