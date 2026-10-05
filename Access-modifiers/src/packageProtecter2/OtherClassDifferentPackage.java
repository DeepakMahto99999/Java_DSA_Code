package packageProtecter2;

import packageProtecter1.Child;

public class OtherClassDifferentPackage {

    public static void main(String[] args) {

        Child s = new Child();

      //  System.out.println(s.name);

      //   s.display();
    }
}

// Error
// 'name' has protected access in 'packageProtecter1'
// 'display()' has protected access in 'packageProtecter1'

// Conclusion

//❌ Protected members cannot be accessed from
// a non-subclass in a different package.