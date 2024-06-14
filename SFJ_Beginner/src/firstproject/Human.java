
package firstproject;


public class Human {
        private String name;
        private int age;

/**Ez a Method leírja a Human nevét.*/
        public void writeMyName() {
                System.out.println("Az én nevem: " + this.name);
        }

        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }
}