package pattern.builderPattern;

public class User {
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    public String getSex() {
        return sex;
    }

    private final int mark;
    private final String sex;

    public User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.mark = builder.mark;
        this.sex = builder.sex;
    }


    public static class Builder {

        private String name;
        private int age;
        private int mark;


        public String getSex() {
            return sex;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public int getMark() {
            return mark;
        }

        public Builder setMark(int mark) {
            this.mark = mark;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        private String sex;

        public Builder(String name, int age) {
            this.name=name;
            this.age=age;
        }

        public User build(){
            return new User(this);
        }

    }
}
