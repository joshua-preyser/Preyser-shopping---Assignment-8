package com.josh;


public class ShopApplication
{
    @bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
    
    public static void main(String[]args)
    {
        SpringApplication.run(ShopApplication.class,args);
    }
}