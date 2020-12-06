package com.example.SistemInformasiAdministrasiSekolah.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SistemInformasiAdministrasiSekolah.models.Jabatan;

@Repository
public interface JabatanRepository extends JpaRepository<Jabatan, Long>{

}
