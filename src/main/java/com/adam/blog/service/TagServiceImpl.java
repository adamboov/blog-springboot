package com.adam.blog.service;

import com.adam.blog.entity.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class TagServiceImpl implements TagService {
    @Override
    public Tag saveTag(Tag tag) {
        return null;
    }

    @Override
    public Tag getTag(Long id) {
        return null;
    }

    @Override
    public Tag getTagByName(String name) {
        return null;
    }

    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return null;
    }

    @Override
    public Tag updateTag(Long id, Tag tag) {
        return null;
    }

    @Override
    public void deleteTag(Long id) {

    }
}
