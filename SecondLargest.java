class SecondLargest { 
    
    public static void print2largest(int arr[],int size)    { 
        int i, f, sec; 
       
        if (size < 2)   { 
            System.out.print(" Invalid Input "); 
            return; 
        } 
       
        f = sec = Integer.MIN_VALUE; 
        
        for (i = 0; i < size ; i++) { 
            if (arr[i] > f) { 
                sec = f; 
                f = arr[i]; 
            } 
       
            else if (arr[i] > sec && arr[i] != f) 
                sec = arr[i]; 
        } 
          
        if (sec == Integer.MIN_VALUE) 
             System.out.print("There is no secand largest"+ 
                                 " element\n"); 
        else
             System.out.print("The secand largest element"+ 
                                      " is "+ secand); 
    }