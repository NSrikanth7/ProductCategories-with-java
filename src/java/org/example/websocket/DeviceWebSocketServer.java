/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.websocket;

/**
 *
 * @author Srikanth
 */
import javax.websocket.server.ServerEndpoint;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;


@ApplicationScoped    
@ServerEndpoint("/actions")
public class DeviceWebSocketServer {
    @OnOpen
    public void open(Session session) {
        
    }

    @OnClose
        public void close(Session session) {
    }

    @OnError
        public void onError(Throwable error) {
    }

    @OnMessage
    public String handleMessage(String message) {
        
        
        JsonObject mobiles = Json.createObjectBuilder()
                        .add("name","Mobiles")
                        .add("childs",Json.createArrayBuilder()
                        .add("Apple")
                        .add("Samsung")
                        .add("Lenovo"))
                        .build();
        JsonObject laptops = Json.createObjectBuilder().add("name","Laptops")
                        .add("childs",Json.createArrayBuilder()
                        .add("Apple")
                        .add("Dell")
                        .add("Lenovo"))
                        .build();
        JsonObject Tablets = Json.createObjectBuilder()
                        .add("name","Tablets")
                        .add("childs",Json.createArrayBuilder()
                        .add("Fossil")
                        .add("Apple")
                        .add("Motorola"))
                        .build();
        JsonObject SmartWatches = Json.createObjectBuilder().add("name","SmartWatches")
                        .add("childs",Json.createArrayBuilder()
                        .add("Apple")
                        .add("Dell")
                        .add("Lenovo"))
                        .build();
        JsonArray jsonArray2=Json.createArrayBuilder()
        .add("Electronics").add("Şahin").build(); 
        JsonObject Electronics = Json.createObjectBuilder()
                        .add("name","Electronics")
                        .add("childs",Json.createArrayBuilder().add(mobiles)
                        .add(laptops)
                        .add(Tablets)
                        .add(SmartWatches))
                        .build();
        
        
        JsonObject washingMachines = Json.createObjectBuilder()
                        .add("name","Washing Machines")
                        .add("childs",Json.createArrayBuilder()
                        .add("Samsung")
                        .add("Whirlpool")
                        .add("Haier"))
                        .build();
        JsonObject televisions = Json.createObjectBuilder()
                        .add("name","Televisions")
                        .add("childs",Json.createArrayBuilder()
                        .add("Sony")
                        .add("Samsung")
                        .add("Hisense"))
                        .build();
        JsonObject refrigerators = Json.createObjectBuilder()
                        .add("name","Refrigerators")
                        .add("childs",Json.createArrayBuilder()
                        .add("Whirlpool")
                        .add("Samsung")
                        .add("Haier"))
                        .build();
        JsonObject airConditioners = Json.createObjectBuilder()
                        .add("name","Air conditioners")
                        .add("childs",Json.createArrayBuilder()
                        .add("Samsung")
                        .add("Godrej")
                        .add("Koryo"))
                        .build();
       
        JsonObject appliances = Json.createObjectBuilder()
                        .add("name","Appliances")
                        .add("childs",Json.createArrayBuilder().add(washingMachines)
                        .add(televisions)
                        .add(refrigerators)
                        .add(airConditioners))
                        .build();
        
        
        JsonObject allToys  = Json.createObjectBuilder()
                        .add("name","All Toys")
                        .add("childs",Json.createArrayBuilder()
                        .add("Toyshine")
                        .add("Negi")
                        .add("Funskool"))
                        .build();
        JsonObject babyProducts = Json.createObjectBuilder()
                        .add("name","All Baby Products")
                        .add("childs",Json.createArrayBuilder()
                        .add("Himalaya")
                        .add("Johnson's")
                        .add("Dabur"))
                        .build();
        JsonObject clothing = Json.createObjectBuilder()
                        .add("name","Kids Clothing")
                        .add("childs",Json.createArrayBuilder()
                        .add("Cool Baby")
                        .add("Kuchipoo")
                        .add("Krystle"))
                        .build();
        
       
        JsonObject babyKids = Json.createObjectBuilder()
                        .add("name","Baby & Kids")
                        .add("childs",Json.createArrayBuilder().add(allToys)
                        .add(babyProducts)
                        .add(clothing))
                        .build();
        
        
        JsonObject kitchen = Json.createObjectBuilder()
                        .add("name","Kitchen & Dining")
                        .add("childs",Json.createArrayBuilder()
                        .add("Bajaj")
                        .add("Hawkins")
                        .add("Pigeon"))
                        .build();
        JsonObject furniture = Json.createObjectBuilder()
                        .add("name","Furniture")
                        .add("childs",Json.createArrayBuilder()
                        .add("Style HomeZ")
                        .add("Ebee")
                        .add("Artesia"))
                        .build();
        JsonObject decor = Json.createObjectBuilder()
                        .add("name","Home Decor")
                        .add("childs",Json.createArrayBuilder()
                        .add("Wipro")
                        .add("Bajaj")
                        .add("Havells"))
                        .build();
        
       
        JsonObject home = Json.createObjectBuilder()
                        .add("name","Home & Furniture")
                        .add("childs",Json.createArrayBuilder().add(kitchen)
                        .add(furniture)
                        .add(decor))
                        .build();
        
        
         JsonObject fiction = Json.createObjectBuilder()
                        .add("name","Fiction Books")
                        .add("childs",Json.createArrayBuilder()
                        .add("Anthologies")
                        .add("Classic Fiction")
                        .add("Contemporary Fiction"))
                        .build();
        JsonObject children = Json.createObjectBuilder()
                        .add("name","children's Books")
                        .add("childs",Json.createArrayBuilder()
                        .add("Adventure")
                        .add("Comics & Mangas")
                        .add("Humour"))
                        .build();
        JsonObject kindle = Json.createObjectBuilder()
                        .add("name","Kindle eBooks")
                        .add("childs",Json.createArrayBuilder()
                        .add("Crime & Thriller")
                        .add("Horror")
                        .add("History"))
                        .build();
        
       
        JsonObject books = Json.createObjectBuilder()
                        .add("name","Books")
                        .add("childs",Json.createArrayBuilder().add(fiction)
                        .add(children)
                        .add(kindle))
                        .build();
        
        
        JsonObject consoles = Json.createObjectBuilder()
                        .add("name","Gaming Consoles")
                        .add("childs",Json.createArrayBuilder()
                        .add("Microsoft")
                        .add("Toyvala")
                        .add("Sony"))
                        .build();
        JsonObject accessories = Json.createObjectBuilder()
                        .add("name","Gameing Accessories")
                        .add("childs",Json.createArrayBuilder()
                        .add("Sony")
                        .add("Quantum")
                        .add("Dragonwar"))
                        .build();
        JsonObject video = Json.createObjectBuilder()
                        .add("name","All Video Games")
                        .add("childs",Json.createArrayBuilder()
                        .add("Valve")
                        .add("Activision")
                        .add("Microsoft"))
                        .build();
        
       
        JsonObject game = Json.createObjectBuilder()
                        .add("name","Gaming & Accessories")
                        .add("childs",Json.createArrayBuilder().add(consoles)
                        .add(accessories)
                        .add(video))
                        .build();
        
        JsonObject categoryMenu = Json.createObjectBuilder().add("menu",Json.createArrayBuilder().add(Electronics).add(appliances)
                                  .add(babyKids).add(home).add(books).add(game)).build();
        
        return categoryMenu.toString();
    }
    
}
