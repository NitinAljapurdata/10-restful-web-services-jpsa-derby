/**
 * 
 */
package viveksingh.restful.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import viveksingh.restful.bean.User;

/**
 * @author vivek_xz2hujv
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
