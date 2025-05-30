package designpatterns.creational.builder;

public class User {
    private final String name;
    private final int age;
    private final String email;
    private final String phone;

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    @Override
    public String toString(){
        return name+age+email+phone;
    }

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static class UserBuilder{
        private String name;
        private int age;
        private String email;
        private String phone;

        User build(){
            return new User(this);
        }

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        UserBuilder age(Integer age){
            this.age = age;
            return this;
        }

        UserBuilder email(String email){
            this.email = email;
            return this;
        }

        UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }
    }
}

