package org.example._2023_09_28.proxy.ex2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface ProductService {
    void checkProducts();
}

class ProductServiceImpl implements ProductService {

    @Override
    public void checkProducts() {
        System.out.println("All products were checked");
    }
}

class ProxyProduct implements InvocationHandler {
    private final Object object;

    public ProxyProduct(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("/////////BEFORE/////////");
        Object newObj = method.invoke(object, args);
        System.out.println("/////////AFTER/////////");
        return newObj;
    }
}

class Main {
    public static void main(String[] args) {
        ProductService realProductService = new ProductServiceImpl();
        ProductService proxy = (ProductService) Proxy.newProxyInstance(
                ProductService.class.getClassLoader(),
                new Class<?>[] {ProductService.class},
                new ProxyProduct(realProductService)
        );

        proxy.checkProducts();
    }
}