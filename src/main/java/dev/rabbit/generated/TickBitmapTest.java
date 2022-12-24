package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Int24;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class TickBitmapTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506105ae806100206000396000f3fe608060405234801561001057600080fd5b50600436106100625760003560e01c80632bdc2fd3146100675780633e7ba2281461009b5780633ffc81ee146100e15780638815912f14610113578063f04bc94314610135578063f0fc922414610155575b600080fd5b6100876004803603602081101561007d57600080fd5b503560020b61017d565b604080519115158252519081900360200190f35b6100c3600480360360408110156100b157600080fd5b50803560020b906020013515156101b2565b6040805160029390930b835290151560208301528051918290030190f35b610101600480360360208110156100f757600080fd5b503560010b6101cd565b60408051918252519081900360200190f35b6101336004803603602081101561012957600080fd5b503560020b6101df565b005b6101016004803603602081101561014b57600080fd5b503560020b6101ef565b6101016004803603604081101561016b57600080fd5b50803560020b9060200135151561020b565b6000808061018e818560018061022b565b915091508360020b8260020b146101a65760006101a8565b805b925050505b919050565b6000806101c2818560018661022b565b915091509250929050565b60006020819052908152604090205481565b6101ec600082600161036d565b50565b6000805a9050610202600084600161036d565b5a900392915050565b6000805a905061021f60008560018661022b565b50505a90039392505050565b60008060008460020b8660020b8161023f57fe5b05905060008660020b12801561026657508460020b8660020b8161025f57fe5b0760020b15155b1561027057600019015b83156102e557600080610282836103d3565b600182810b810b600090815260208d9052604090205460ff83169190911b800160001901908116801515975092945090925090856102c757888360ff168603026102da565b886102d1826103e5565b840360ff168603025b965050505050610363565b6000806102f4836001016103d3565b91509150600060018260ff166001901b031990506000818b60008660010b60010b815260200190815260200160002054169050806000141595508561034657888360ff0360ff1686600101010261035c565b888361035183610485565b0360ff168660010101025b9650505050505b5094509492505050565b8060020b8260020b8161037c57fe5b0760020b1561038a57600080fd5b6000806103a58360020b8560020b8161039f57fe5b056103d3565b600191820b820b60009081526020979097526040909620805460ff9097169190911b90951890945550505050565b60020b600881901d9161010090910790565b60008082116103f357600080fd5b600160801b821061040657608091821c91015b68010000000000000000821061041e57604091821c91015b640100000000821061043257602091821c91015b62010000821061044457601091821c91015b610100821061045557600891821c91015b6010821061046557600491821c91015b6004821061047557600291821c91015b600282106101ad57600101919050565b600080821161049357600080fd5b5060ff6fffffffffffffffffffffffffffffffff8216156104b757607f19016104bf565b608082901c91505b67ffffffffffffffff8216156104d857603f19016104e0565b604082901c91505b63ffffffff8216156104f557601f19016104fd565b602082901c91505b61ffff82161561051057600f1901610518565b601082901c91505b60ff82161561052a5760071901610532565b600882901c91505b600f821615610544576003190161054c565b600482901c91505b600382161561055e5760011901610566565b600282901c91505b60018216156101ad576000190191905056fea26469706673582212205b19d4f8ea8382777f4056df1dc210b87f692d12ad2f99dc60637740044d530264736f6c63430007060033";

    public static final String FUNC_BITMAP = "bitmap";

    public static final String FUNC_FLIPTICK = "flipTick";

    public static final String FUNC_GETGASCOSTOFFLIPTICK = "getGasCostOfFlipTick";

    public static final String FUNC_GETGASCOSTOFNEXTINITIALIZEDTICKWITHINONEWORD = "getGasCostOfNextInitializedTickWithinOneWord";

    public static final String FUNC_ISINITIALIZED = "isInitialized";

    public static final String FUNC_NEXTINITIALIZEDTICKWITHINONEWORD = "nextInitializedTickWithinOneWord";

    @Deprecated
    protected TickBitmapTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TickBitmapTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TickBitmapTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TickBitmapTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> bitmap(BigInteger param0) {
        final Function function = new Function(FUNC_BITMAP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int16(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> flipTick(BigInteger tick) {
        final Function function = new Function(
                FUNC_FLIPTICK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> getGasCostOfFlipTick(BigInteger tick) {
        final Function function = new Function(
                FUNC_GETGASCOSTOFFLIPTICK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> getGasCostOfNextInitializedTickWithinOneWord(BigInteger tick, Boolean lte) {
        final Function function = new Function(FUNC_GETGASCOSTOFNEXTINITIALIZEDTICKWITHINONEWORD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick), 
                new org.web3j.abi.datatypes.Bool(lte)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Boolean> isInitialized(BigInteger tick) {
        final Function function = new Function(FUNC_ISINITIALIZED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<Tuple2<BigInteger, Boolean>> nextInitializedTickWithinOneWord(BigInteger tick, Boolean lte) {
        final Function function = new Function(FUNC_NEXTINITIALIZEDTICKWITHINONEWORD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int24(tick), 
                new org.web3j.abi.datatypes.Bool(lte)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int24>() {}, new TypeReference<Bool>() {}));
        return new RemoteFunctionCall<Tuple2<BigInteger, Boolean>>(function,
                new Callable<Tuple2<BigInteger, Boolean>>() {
                    @Override
                    public Tuple2<BigInteger, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<BigInteger, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (Boolean) results.get(1).getValue());
                    }
                });
    }

    @Deprecated
    public static TickBitmapTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TickBitmapTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TickBitmapTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TickBitmapTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TickBitmapTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TickBitmapTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TickBitmapTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TickBitmapTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TickBitmapTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TickBitmapTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TickBitmapTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TickBitmapTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<TickBitmapTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TickBitmapTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TickBitmapTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TickBitmapTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
