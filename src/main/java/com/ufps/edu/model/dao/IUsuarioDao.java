package com.ufps.edu.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.edu.model.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long>{

}
