package packageDefault2;

import packageDefault1.Car;

public class SubClassDifferentPackage extends Car {

    public static void main(String[] args) {

        SubClassDifferentPackage c = new SubClassDifferentPackage();

      //  System.out.println(c.name);

      //  c.display();
    }
}


//| Case                          | Result  |
//| ----------------------------- | :----:  |
//| Same Class                    |    ✅   |
//| Same Package                  |    ✅   |
//| Subclass Same Package         |    ✅   |
//| Subclass Different Package    |    ❌   |
//| Other Class Different Package |    ❌   |
