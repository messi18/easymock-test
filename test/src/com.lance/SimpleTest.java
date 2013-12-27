package com.lance;

import org.junit.Test;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;

/**
 * Created by malance on 13-12-26.
 */
public class SimpleTest {
    @Test
    public void testSimpleDao(){
        SimpleDao dao = createMock(SimpleDao.class);
        expect(dao.getUserList());
    }
}
