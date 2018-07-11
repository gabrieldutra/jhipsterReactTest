package io.github.gabrieldutra.jhipsterreacttest.repository;

import io.github.gabrieldutra.jhipsterreacttest.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
