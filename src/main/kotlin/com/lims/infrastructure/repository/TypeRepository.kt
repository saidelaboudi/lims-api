package com.lims.infrastructure.repository

import com.lims.infrastructure.model.Type
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TypeRepository :JpaRepository<Type,Long>{
}