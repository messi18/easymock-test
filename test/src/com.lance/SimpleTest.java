package com.lance;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.easymock.EasyMock.*;

/**
 * Created by malance on 13-12-26.
 */
public class SimpleTest {

    private SimpleDao mock;

    @Before
    public void init(){
        mock = createMock(SimpleDao.class);
    }

    @Test
    public void testSimpleDao(){

        expect(mock.getUserList()).andReturn(null);

        replay(mock);

        assertEquals(null, mock.getUserList());

        verify(mock);
    }

    @Test
    public void shouldSaveObject() {
        User user = new User("test","123");
        expect(mock.saveUser(user)).andReturn(true).anyTimes();
        List<User> result = new ArrayList<User>();
        result.add(user);

        expect(mock.getUserList()).andReturn(result).anyTimes();
        replay(mock);

        assertEquals(true, mock.saveUser(user));
        assertEquals(1, mock.getUserList().size());
        assertEquals(user, mock.getUserList().get(0));

        verify(mock);

    }
}
