package com.example.springbootPCFApp;

import org.springframework.data.repository.CrudRepository;

public interface ApiRepository extends CrudRepository<Professor,String> {
}
