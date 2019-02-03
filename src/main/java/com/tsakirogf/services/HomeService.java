package com.tsakirogf.services;

import com.tsakirogf.model.Shipwreck;
import org.springframework.data.repository.CrudRepository;

public interface HomeService extends CrudRepository<Shipwreck, Integer>
{

}
