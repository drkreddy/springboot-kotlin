package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import javax.validation.Valid

@RestController
@RequestMapping("/customers")
class CustomerController(private val repository: CustomerRepository) {

	@GetMapping()
	fun findAll() = repository.findAll()

	@PostMapping()
	fun post(@RequestParam(value = "id", required = true) id:Array<MultipartFile>, @Valid cust: CustomerRequest) = "done"
}
