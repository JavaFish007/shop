package com.xmg.test;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.xmg.shop.domain.Product;
import com.xmg.shop.service.IProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class ProductShowTest {

    public static void main(String[] args) {
        new ProductShowTest().show();
    }

    public void show(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-client.xml");
        IProductService productService = (IProductService) context.getBean("productService");
        Product product = productService.get();
        System.out.println(product.getName());

    }

    public void test(){
        //应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("client-mgrsite");

        //连接注册中心
        RegistryConfig registryConfig = new RegistryConfig();
        //设置注册中心地址
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        //引用远程服务地址
        ReferenceConfig<IProductService> referenceConfig = new ReferenceConfig<IProductService>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface("com.xmg.shop.service.IProductService");

        //和本地一样调用服务
        IProductService productService = referenceConfig.get();
        Product product = productService.get();
        System.out.println("客户端"+product.hashCode());
        System.out.println(product.getName());
    }
}
