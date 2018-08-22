package com.grupoaps.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupoaps.gestao.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
