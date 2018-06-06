package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/customers")
class CustomerController(private val repository: CustomerRepository) {

	@GetMapping()
	fun findAll() = repository.findAll()

	@PostMapping()
	fun post(@Valid cust: CustomerRequest) = "done"
}
