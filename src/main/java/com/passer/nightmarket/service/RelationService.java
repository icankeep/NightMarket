package com.passer.nightmarket.service;

import generator.Relation;
import generator.RelationDao;
import generator.RelationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description:
 * @author: passer
 * @version：2020/3/4
 */
@Service
public class RelationService {
    @Autowired
    private RelationDao relationDao;

    public List<Integer> selectRelationOtherOne(int userId) {
        List<Integer> otherOnes = new ArrayList<>();
        RelationExample relationExample = new RelationExample();
        relationExample.createCriteria().andUserId1EqualTo(userId);
        otherOnes.addAll(relationDao.selectByExample(relationExample).
                stream().map(Relation::getUserId2).collect(Collectors.toList()));
        relationExample = new RelationExample();
        relationExample.createCriteria().andUserId2EqualTo(userId);
        otherOnes.addAll(relationDao.selectByExample(relationExample).
                stream().map(Relation::getUserId1).collect(Collectors.toList()));
        return otherOnes;
    }

    public Relation insertRelation(int userId1, int userId2) {
        Relation relation = new Relation();
        relation.setUserId1(userId1);
        relation.setUserId2(userId2);
        relationDao.insert(relation);
        return relation;
    }
}
