package PackagePrivate1;

public class samePackage {

    public static void main(String[] args) {

        student s = new student();
        //  System.out.println(s.name);
       // s.display();

    }
}

// java: display() has private access in
// PackagePrivate1.student

//| Case                          | Result |
//| ----------------------------- | :----: |
//| Same Class                    |    ✅  |
//| Same Package                  |    ❌  |
//| Subclass Same Package         |    ❌  |
//| Subclass Different Package    |    ❌  |
//| Other Class Different Package |    ❌  |

// private → accessible only within the same class.