package br.unipe.luisdev.web.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.unipe.luisdev.web.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
}
