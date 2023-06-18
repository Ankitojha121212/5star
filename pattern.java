public class pattern{

    public static void main(String args[]) {
        int i,j;
        int n=30;
        // Logic 1
        /* 
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        */
        //  Logic 2
        /*
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        // Logic 3
        /* 
        for(i=1;i<=4;i++){
            for(j=1;j<=i-1;j++){
                System.out.print("*");
            }System.out.println();
        }
        */
         // Logic 4
           /* 
         for(i=1;i<=4;i++){
            for(j=1;j<=i*;j++){
                System.out.print(" * ");
            }
            System.out.println();
         }
        */
         // Logic 5
         /* 
         for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(i==1 || j==1 || i==5 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
         }
         */

         // Logic 6 (A Shape)
         /* 
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1 || i==(n-1)/2 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                } }System.out.println();
        }
        */
     // Logic 7 (H Shape)
        /* 
     for(i=0;i<n;i++){
        for(j=0;j<n;j++){
        if(j==0 || j==n-1 || i==(n-1)/2 ){
            System.out.print("*");
        }
        else{System.out.print(" ");}

        }System.out.println();
     }*/
     // Logic 8 (I Shape)
     /* 
     for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==0 || i==n-1 || j==(n-1)/2){
                System.out.print("*");
            }
            else{System.out.print(" ");}
        }System.out.println();
     }*/
      // Logic 9(E Shape)
       /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==0 || i==(n-1)/2 || i==n-1 || j==0){
                System.out.print("*");
            }
            else{System.out.print(" ");}
        }System.out.println();
      }
      */
      // Logic 10(F shape)
      /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==0 || i==(n-1)/2 && j<=(n-1)/2 || j==0){
                System.out.print("*");
            }
            else{System.out.print(" ");}
        }System.out.println();
      }*/
      // Logic 11( curver A)
      /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if( j==0 && i>0 || i>0 && j==n-1  || i==(n-1)/2 || i==0 && j>0 && j<n-1 ){
                System.out.print("*");
            }
            else{System.out.print(" ");}
        }System.out.println();
      }*/
      // Logic 12 ( half coloumn curved A)
      /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || i==0 && j>0 && j<(n-1)/2 ){
                System.out.print("*");
            }
            else{System.out.print(" ");}
        }System.out.println();
      }
      */
      // Logic 13 ( half coloumn curved D) Twice
       /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(j==0 || i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1){
                System.out.print("*");
            } else{System.out.print(" ");}
        }System.out.print(" ");

            for(j=0;j<n;j++){
                if(j==0 || i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1){
                    System.out.print("*");
                } else{System.out.print(" ");}
        }System.out.println();
      }
      */


      /////////// Complex Logic
      //////Logic 14
      // Digonals print
      /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j || i+j==n-1){
                System.out.print("*");
            }else {System.out.print(" ");}
        }System.out.println();
      }
      */
      // Digonals in a closed 
      /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j || i+j==n-1 || i==0 || i==n-1 || j==0 || j==n-1){
                System.out.print("*");
            }else{System.out.print(" ");}
        }System.out.println();
      }
     */
    // Logic for diamond shape
    /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2){
                System.out.print("*");
            }else{System.out.print(" ");}
        }System.out.println();
      }
      */
      
      // Logic for diamond shape with border
      /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2 || i==0 ||j==0 || i==(n-1) || j==n-1){
                System.out.print("*");
            }
            else{System.out.print(" ");}
        }System.out.println();
      }
      */

      // Logic for Diamond shape with sides are full of stars
      /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2 || j-i>=(n-1)/2 || j-i>=(n-1)/2 || i+j>=(n-1)/2 + (n-1)) {
                System.out.print("*");
            }
            else{System.out.print(" ");}
        }
        System.out.println();
      }
      */
      // Logic for Diagonal with diamond shape in it
       /* 
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2){
                System.out.print("*");
            }
            else{System.out.print(" ");}
        }System.out.println();
      }
      */
       ////// The blank diamond shape in a box and star printing sourrounding it
       
     for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            } }
            System.out.println();}
            
            
    }
    }