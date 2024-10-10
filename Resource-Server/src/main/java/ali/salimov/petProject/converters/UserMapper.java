package ali.salimov.petProject.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.springframework.core.convert.converter.Converter;

import ali.salimov.petProject.dto.UserDto;
import ali.salimov.petProject.model.User;

@Mapper(componentModel = "spring")
@Named("UserTranslator")
public interface UserMapper {
	@Named("UserDtoToUser")
	User entity (UserDto dto);
	@Named("UserToUserDto")
	UserDto dto(User user);
}
