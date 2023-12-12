public class ArrayList {

    private int[] _array;
    private int _size;
    public int Count;

    public ArrayList(int[] _array, int count) {
        this._array = _array;
        Count = count;
    }
    public ArrayList() {
        _array = new int[10];
        Count = 0;
    }
    public ArrayList(int[] element){
        _array = new int[(int)(element.length * 1.5)];
        System.arraycopy(element,0, _array, 0, element.length);
        Count = element.length;
    }
    public int Get (int index){
       if(index <0 || index >= Count){
           throw new IndexOutOfBoundsException("Bad index");
       }
       return _array[index];
    }
    public void AddElement (int element){
        if(Count >= _array.length){
            _array[Count] = element;
            Count++;
        }
    }
    private void IncreaseLength (int elementCount){
        int newLenght = (int)((_array.length + elementCount) * 1.5);
        int[] newArray = new int[newLenght];
        System.arraycopy(_array,0, newArray, 0, _array.length);
        _array = newArray;
    }
    public void Add(int[] elements){
        if (elements.length > _array.length - Count){
            IncreaseLength(elements.length);
        }
        for(int i = 0; i < elements.length; i++) {
            _array[Count]= elements[i];
            Count++;
        }

    }

}
