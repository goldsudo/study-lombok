import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/*
    public class GetterSetterExample {
    private int age = 10;
        private String name;

        @Override public String toString() {
            return String.format("%s (age: %d)", name, age);
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        protected void setName(String name) {
            this.name = name;
        }
    }
*/

public class GetterSetterExample {
    @Getter @Setter private int age = 10;

    @Setter(AccessLevel.PROTECTED) private String name;

    @Override public String toString() {
        return String.format("%s (age: %d)", name, age);
    }
}

