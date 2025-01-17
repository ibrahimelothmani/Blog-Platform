package com.ibrahim.mappers;

import com.ibrahim.domain.CreatePostRequest;
import com.ibrahim.domain.UpdatePostRequest;
import com.ibrahim.domain.dtos.CreatePostRequestDto;
import com.ibrahim.domain.dtos.PostDto;
import com.ibrahim.domain.dtos.UpdatePostRequestDto;
import com.ibrahim.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);

}
