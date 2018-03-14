import com.mongodb.*;

public class MongoDBIntro
  {
      public static void main( String args[] ) throws Exception
      {
          try
          {
              MongoClient mongoClient = new MongoClient("localhost", 27017);
              DB db = mongoClient.getDB("intercomcodingtest");
              System.out.println("Connection Success");

              mongoClient.getDatabaseNames().forEach(System.out::println);

              db.getCollectionNames().forEach(System.out::println);

              BasicDBObject searchQuery = new BasicDBObject();

              searchQuery.put("name", "David Behan");

              

              DBCollection collection = db.getCollection("customer");


              DBCursor cursor = collection.find(searchQuery);



              while (cursor.hasNext()) {
                  System.out.println(cursor.next());
              }

          }catch(Exception e)
          {
              System.out.println(e);





          }

          //System.out.println("Server Ready");







      }




  }//end of class MongoDBIntro
