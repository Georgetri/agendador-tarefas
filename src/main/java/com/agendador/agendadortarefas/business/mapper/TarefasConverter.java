package com.agendador.agendadortarefas.business.mapper;

import com.agendador.agendadortarefas.business.dto.TarefasDTO;
import com.agendador.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

   // List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos);

    // List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entities);

}
