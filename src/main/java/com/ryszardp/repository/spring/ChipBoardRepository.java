package com.ryszardp.repository.spring;

import com.ryszardp.domain.materials.Chipboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ChipBoardRepository extends JpaRepository<Chipboard,Long>, CrudRepository<Chipboard,Long>, PagingAndSortingRepository<Chipboard,Long> {

    List<Chipboard>findAllByThickness(Long thickness);


}
