package com.github.dge1992.ssm.service.impl;

import com.github.dge1992.ssm.domain.Person;
import com.github.dge1992.ssm.dao.PersonMapper;
import com.github.dge1992.ssm.service.IPersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dong
 * @since 2018-02-08
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
