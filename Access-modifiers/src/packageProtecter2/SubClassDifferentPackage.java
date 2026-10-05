package packageProtecter2;

import packageProtecter1.Child;

public class SubClassDifferentPackage extends Child {


    // 1. Subclass object + Subclass reference

    public static void main(String[] args) {

        SubClassDifferentPackage s =
                new SubClassDifferentPackage();

        System.out.println(s.name);   // ✅
        s.display();                  // ✅



        // 2. Parent reference + Parent object

        // Child c = new Child();     // ✅ Object creation is allowed

        // System.out.println(c.name); // ❌
        // c.display();                // ❌

        /*
         * Child c = new Child();
         *
         * The statement itself is valid.
         * But protected members cannot be accessed
         * through a Child reference from a different package.
         */



        // 3. Parent reference + Subclass object

        // Child c2 = new SubClassDifferentPackage(); // ✅

        // System.out.println(c2.name); // ❌
        // c2.display();                // ❌

        /*
         * The actual object is SubClassDifferentPackage,
         * but the reference type is Child.
         *
         * For protected access across packages,
         * the reference used to access the member
         * must have the subclass type (or a subtype).
         */



        // 4. Subclass reference + Subclass object

        SubClassDifferentPackage s2 =
                new SubClassDifferentPackage();

        System.out.println(s2.name);   // ✅
        s2.display();                  // ✅

        SubClassDifferentPackage obj = new SubClassDifferentPackage();
        obj.testProtectedAccess();
    }



    // 5. this and super

    void testProtectedAccess() {

        System.out.println(this.name);   // ✅
        this.display();                  // ✅

/*
 * Here, this.name accesses the name variable belonging to the current Student object.
 */

        System.out.println(super.name);  // ✅
        super.display();                 // ✅

/*
* Access parent class variables when they are hidden by child class variables.
* Call parent class methods when they are overridden in the child class.
*/

    }


}



//Output
//  Deepak
//  Protected Method

// Conclusion
//✅ Accessible in a subclass from a different package.

//protected
//
//Same Class                 ✅
//Same Package               ✅
//Subclass Same Package      ✅
//Subclass Different Package ✅
//Other Class Different      ❌

// Child s = new Child();
// In a different package, a subclass can access inherited protected members
// through this, super, or a reference of the subclass type (or its subtype).
// It cannot access them through a reference of the parent class type.