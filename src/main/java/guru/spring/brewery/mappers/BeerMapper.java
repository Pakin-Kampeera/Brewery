package guru.spring.brewery.mappers;

import guru.spring.brewery.domains.Beer;
import guru.spring.brewery.models.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
