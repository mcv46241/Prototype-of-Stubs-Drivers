# Prototype-of-Stubs-Drivers
A sample prototype of stubs and drivers, have implemented with simple example to show how they function. 

Let's create a simplified example of a shopping cart system. We'll have a ShoppingCart class responsible for managing items added by a user and calculating the total price. We'll use stubs and a driver to test this functionality. 
The stub is used for simulating the behavior of an external system that provides item prices. For simplicity, we'll just provide fixed prices using these stubs. 
The driver to test the ShoppingCart class using the stubbed ItemPriceService.

In this example:
1. The ShoppingCart class calculates the total price of items in the shopping cart based on the prices provided.
2. The ItemPriceServiceStub simulates an external service that provides item prices. It returns fixed prices for known items.
3. The ShoppingCartDriver class serves as a driver to test the ShoppingCart class using the stubbed ItemPriceService.

