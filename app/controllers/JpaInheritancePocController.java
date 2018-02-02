package controllers;

import models.Bar;
import models.Foo;
import play.Logger;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static play.mvc.Results.ok;


public class JpaInheritancePocController extends Controller{




    @Transactional
    public  Result save(){
        try{
            EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("defaultPersistenceUnit");
            EntityManager entityManager=entityManagerFactory.createEntityManager();
            Logger.info("helloJPa inheritance");
            Foo foo= new Foo();
            foo.setFooName("foo");
            Bar bar=new Bar();
            bar.setBarName("bar");
            foo.setBar(bar);
            //foo.getBar().setBarName("bar");
           // foo.getBar().setBarName("bar");
            Logger.info("foo*************"+foo);
            entityManager.getTransaction().begin();
            entityManager.persist(foo);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return ok();
    }
}
