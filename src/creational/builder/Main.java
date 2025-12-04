package creational.builder;

public class Main {
  public static void main(String[] args) {
    Query query = new Query.Builder()
        .select("*")
        .tableName("Users")
        .where("cityId = 3")
        .orderBy("id")
        .limit(5)
        .build();

    System.out.println(query);
  }
}
