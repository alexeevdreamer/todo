package com.raif.todotask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/hello/{id}")
    public String sayPathHello(@PathVariable Integer id){
        return "Hello"+id.toString();
    }

    /*
    RestFull
    get - получить
    post - создание- не идемпотентное
    put - для изменения существующего - редактирования
    delete -
    patch - для изменения сущности

    * Rest api entity
    * GET /tasks - get all
    * GET /tasks/{id} - конкретную таску
      POST /tasks - create task
      PUT /tasks/{id} - update id task
      PUT /task/{id}/name

      Entity
      Task
      ImplTask

      Service - бизнес логика

      Repository - хранение

      Dto - data transfer object

    * Для фильтрации и уточнения
    * */
    @GetMapping("/param")
    public String sayParamHello(@RequestParam String id){
        return "Hello"+id;
    }
}
