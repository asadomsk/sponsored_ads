# sponsored_ads
General  
As an ad tech company we want to develop a module that enables sellers to create campaigns for  
promoting their products.  

Entities  
There are (at least) two main entities composing this module:  
1. Product - simply represents a product with title, category, price and product-serial number (can  
be any int/string-sequence for the sake of this exercise)  
2. Campaign - a group of products to promote(/advertise) with shared properties: start-date,  
category, bid. As well campaign has a name.  
a. Campaign is considered active for the 10 days following its start-date.  
b. Different campaigns may promote the same product  

APIs  
The module should provide 2 APIs:  
1. Create campaign - api for creating a campaign  
a. Parameters:  
i. name  
ii. startDate  
iii. category - a string representing the category to which the advertised products of  
the campaign belong to (e.g., smartphone, shoes, t-shirts, etc...)  
iv. Bid - the price seller is willing to pay for a click on a product advertised in this  
campaign  

b. Expected result: a campaign is created (with specified parameters) ready to promote all  
products of the specified category  
c. Response - a json representation of the created campaign  
2. Serve Ad - api to retrieve ads  
a. Parameters:  
i. Category - a String representing category of products  
b. Expected Result:  
i. the api should return a single promoted product, the one with the highest bid,  
belonging to active campaign/s from the specified category. If there are no  
promoted product for the matching category simply return a promoted product  
with the highest bid.  

ii. The response should be in JSON format  

##How to run

1. Create a campaign (Post method)  
http://localhost:8080/Create_campaign  
Use next JSON format  

{  "name":"aaa",  
   "start_date":"2021-01-17",  
   "category": "bb",  
   "bid":"10",  
   "promoted_products":[  
   
   { "title":"nnnn",	   
   "category":"bb",  
   "price": "20",  
   "serial_Num":"40"},  
   
    
   { "title":"jjjjj",	   
   "category":"bb",  
   "price": "20",  
   "serial_Num":"40"}  
  
   ]  
}  
2. ## Retrieve ads  
Use Get method  
http://localhost:8080/Serve_ad?category=bb  

3. D.B 
I use H2 D.B. of Spring Boot
To connect to db use
##JDBS URL - jdbc:h2:mem:testdb
#user name - sa
#password - empty
